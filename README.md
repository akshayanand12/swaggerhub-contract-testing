# swaggerhub-contract-testing

This is a design first contract testing using the wonderful library created by ``atlassian``

This repo shows a sample of how the contract testing concept can be applied even when you are doing a design first API Development.
In this case 
- SwaggerHub is considered to be a place where one designs versioned APIs and is the source of specs, something like a ``Broker``.
- This Spring boot application is the ``Provider`` which pulls the specs(contracts) from SwaggerHub to ensure API implementation aligns with the specs.
- Any web application in future can be ``Consumer`` of the APIs and can write test cases against the mock created by SwaggerHub.

The flow works something like  ``Consumer (validates usage against mock)`` <-- ``Broker (contract is written)`` --> ``Provider (validates implementation contract)``

## Steps to run this repo

### Setup code
- git clone https://github.com/akshayanand12/swaggerhub-contract-testing.git
- ``` mvn clean install ``` (considering maven is setup on your machine)

### Setup static server 
- Install ```npm install http-server -g```
- Run ```http-server ./src/test/resources```

### Run Contract Test
- ``` mvn test -Dgroups="ContractTest" ```

