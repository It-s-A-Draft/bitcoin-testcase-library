# **bitcoin-testcase-library**

## *A repository of test case data for Bitcoin functionality*

_Welcome - from the *It's A Draft* Discord group._

This data set is designed to be a repository of valid inputs and outputs for various aspects of Bitcoin functionality.

Tests are organized according to general functionality, and processes involved to achieve that functionality.

Test cases for each function are structured in a (Given), When, Then format as follows:
- (Given): Optional - The conditions under which the test case is valid
- When: The specific inputs for the test case
- Then: The expected behavior, or outputs, for the test case with the stated inputs

The goal is to make this data set implementation agnostic, and useful for any project that wishes to implement the general functionality covered by this data set.

If the test case coverage is complete and accurate, application code that passes all properly implemented tests under all conditions applicable to the application should be an acceptable implementation for that functionality.

It is the responsibility of the application developer to understand and properly test their own application under all applicable conditions, and to confirm that their specific implementation does not introduce functionality not covered by these test cases without creating their own tests to ensure reliability. This library is meant to help developers implement generalized functionality, not to do their job for them.

## Testing Data Set is to include the following:

| Topic | Status |
| ----- | ------ |
| Base58 Check Encoding | Incomplete |
| Hash160 and Hash256 | Incomplete |
| Addresses | Incomplete |
| WIF | Incomplete |
| DER Signatures | Incomplete |
| Proof of Work | Incomplete |
| Difficulty | Incomplete |
| Headers | Incomplete |
| Merkle Trees and Branches | Incomplete |
| HD | Incomplete |
| ECIES | Incomplete |
| Signature Hash Algorithm | Incomplete |
| Bitcoin Script | Incomplete |

## Project License, Intentions, and How to Help

This data set is released under a CC0-1.0 license with the intention of making it free to use with no restrictions or requirements placed on the user. In addition, while this data is put together with the best of intentions and with the best effort to be complete, reliable, and helpful, we are not guaranteeing any of those things.

Said differently, it is our goal to provide a useful data set, but we're human, we're learning, and we, like anyone else, are susceptible to making mistakes. If you encounter a problem with anything contained in this data set, or find that this data set is incomplete, we humbly request that you create a pull request or otherwise report the issue in order to help us improve the completeness and reliability of the data set.
