Oliver Howard's Data-driven testing tutorial in Katalon Studio --- revised
============

Oliver Hower wrote a nice article 
[Approach Data-diriven framework in software testing](https://dzone.com/articles/data-driven-testing-approach-with-katalon-studio) about "Data-driven testing" in Katalon Studio.

In this article, Oliver described that there are 2 approaches of using the Data-driven testing feature.

- A. Execution from test Suites
- B. Execute from test Cases

On the other hand, the [official document](https://docs.katalon.com/katalon-studio/docs/ddt.html) by Katalon covers only the "A". It does not even mention the "B" approach at all. Therefore most of the Katalon users do not know the "B" at all. The article by Oliver would introduce the "B" to Katalon users.

In the "B" approach, your Test Case script explicitly loop through the data using `for` statement.

## Why a revision required?

The sample code by Oliver of the B approach worked until the Katalon Studio version 6.2.2. However, the sample code no longer works in the 6.3.x and newer.

Why?

Oliver's code imports and use `com.kms.katalon.core.testdata.InternalData` class, which does not work since v6.3.0. Instead, you should use `com.kms.katalon.core.testdata.TestData` class. That's the only change required.

I will show you [a revised version](Scripts/TC2_loopOverTestData/Script1567483355864.groovy) of the Oliver's sample code. It works in the KS v6.3.x and newser.
