[![pipeline status](https://gitlab.com/tcgone/engine-card-impl/badges/master/pipeline.svg)](https://gitlab.com/tcgone/engine-card-impl/commits/master)

TCG ONE's card implementation repository.

Please see <https://forum.tcgone.net/t/card-implementation-guide/26> for updated instructions. You are welcome to submit merge (pull) requests.

### Repository Rules

- Please DO NOT commit any other file than card implementation files like metadata files, IDE garbage, etc, your merge request will not be accepted.
- Please also be careful to NOT let your IDE/editor to enforce some whitespace ruling to change whitespaces of files, it makes really hard to track real changes.
- We are using NO MERGE COMMIT, ALL REBASE approach to track repository history, please always `git pull --rebase --autostash` to get changes from the server.
