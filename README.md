Oliver Howard's Data-driven testing tutorial
============

Oliver Hower wrote a very nice article [Approach Data-diriven framework in software testing](https://dzone.com/articles/data-driven-testing-approach-with-katalon-studio). In this artidle, Oliver described that there are 2 methods of using data.

A. data associated to a Test Suites
B. your Test Case script explicitly loop through the data via `com.kms.katalon.core.testdata.InternalData'

The method B worked until the Katalon Studio version 6.2.2.
Unfortunately the method B no longer works in the 6.3.x.

This project provides Howard's tutorial code set, with which you can verify if it works with the KS versions.
