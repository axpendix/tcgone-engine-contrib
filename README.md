TCG ONE engine contribution repository. It is mainly used for storing open source card implementations.

**NOTE:** Repository was moved from [gitlab](https://gitlab.com/tcgone/engine-card-impl).

Please see <https://forum.tcgone.net/t/card-implementation-guide/26> for instructions. You are welcome to submit pull requests.

### Repository Rules

- NO MERGE COMMITS! ALWAYS USE REBASE! Please always run `git pull --rebase --autostash` to get changes from the server, else you may litter the repository history.
- Please DO NOT commit any other file than card implementation files like metadata files, IDE garbage, etc, your merge request will not be accepted.
- Please also be careful to NOT let your IDE/editor to enforce some whitespace ruling to change whitespaces of files, it makes really hard to track real changes.

### Building and Testing

After every push to `master`, our CI system will automatically rebuild the code and if everything goes well,
it will deploy to [staging dev server](https://dev.tcgone.net). This server can be used to test cards before going to production.

If the build fails, you can check the logs via the status icon near every commit, first click the icon then click 'details'.

Please test ALL cards by invoking ALL of their effects.

### What to do?

We usually have a lot of bugs to sort out, please go to <https://forum.tcgone.net/c/bug-reports> then start hunting them!

Other than that, you may start looking at the missing sets (gen3 and gen4 mostly) and start coding!
