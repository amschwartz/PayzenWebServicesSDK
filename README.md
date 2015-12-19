# Payzen SDK SOAP Web Services v5 in Java #

This SDK simplifies the use of Web Services SOAP Payzen v5 in order to make payment operations. 

## Basic Usage ##
To use this SDK in your Java project you can download the last version here:

http://profesorfalken.github.io/lib/PayzenWebServicesSDK-0.1.1.jar

The only dependencies are:

- *commons-codec-1.10.jar*
- *commons-lang-2.6.jar*
- *slf4j-api-1.7.12.jar*

Once downloaded all the JAR files and placed in the classpath of your application, it is necessary to set up the config file.

In order to do that you have to create a resource file called *payzen-config.properties* into your classpath and set the following configuration params:

    shopId=[shop identifier]
    shopKey=[shop private key]
    mode=[mode TEST or PROD]
    endpointHost=[the name of the host. Ex: secure.payzen.eu]


Once the configuration is set up, use the web services is as simple as doing: 

    create("Test Order",
                100, 
                978,
                "4970100000000003",
                12,
                2017,
                "123",
                (result) -> "Payment Done"
    );
 
Really, is that easy.



## More examples ##

**Create payment using builder objects:** 

    OrderRequestBuilder orderRequestBuilder
        = OrderRequestBuilder
        .create()
        .orderId("TestTRS");

    PaymentRequestBuilder paymentRequestBuilder
        = PaymentRequestBuilder
        .create()
        .amount(100)
        .currency(978);

    CardRequestBuilder cardRequestBuilder
        = CardRequestBuilder
        .create()
        .number("4970100000000003")
        .scheme("CB")
        .expiryMonth(12)
        .expiryYear(2017)
        .cardSecurityCode("123");

    create(PaymentBuilder
        .getBuilder()
        .order(orderRequestBuilder.build())
        .payment(paymentRequestBuilder.build())
        .card(cardRequestBuilder.build())
        .comment("Test payment")
        .buildCreate(),
        (result) -> "Payment Done"
    );


**Log all the response:**

    create("Test Order",
                100, 
                978,
                "4970100000000003",
                12,
                2017,
                "123",
                new LogResponseHandler()
    );


**Use annonymous functions as callback handlers (needed for Java < 8)**


    create("Test Order",
                100, 
                978,
                "4970100000000003",
                12,
                2017,
                "123",
                new ResponseHandler() {
		            @Override
		            public void handle(ServiceResult result) throws Exception {
		                //Process response here
		            }
		        });
    );


**Handle the response in a classic way, not using callbacks**

    ServiceResult result = create("Test Order",
                100, 
                978,
                "4970100000000003",
                12,
                2017,
                "123"
    );

    //Process payment result using getters

## How to build the library ##


- Install maven


- Download and import the project into your IDE or simply clone it from Git.

- First time run from root directory: *mvn -Pgenerate-ws-stubs install*. This will generate all the web service stubs.

- From that time, it is enough to execute *mvn install* to regenerate the library.

- If the tests fail because the configuration data is not right you can skip the tests using *mvn install -Dmaven.test.skip=true*

