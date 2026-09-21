# TCG ONE Engine Contrib 

This is TCG ONE engine contribution repository.
Stores card implementations that are open for contribution.
You are welcome to submit pull requests.

# The path to become a TCG ONE Developer

### Essentials
- Except this repository, TCG ONE is NOT an open source project. Cards are implementated in Groovy language (a superset of Java) with our custom designed DSL and each expansion (i.e. `CelestialStorm.groovy`) has logical implementation of its cards. All card effects need to be programmed to show up in the game.
- On the other hand, the TCG ONE Engine is closed source and cannot be locally run by a non-staff member.
- Not all cards or effects are available in this repository, most are closed source.
- [Developer UI](https://dev.tcgone.net/) is a special UI that features a simplified sandbox environment to test all cards' game play.
- Developer UI gets rebuilt and updated after every push to `master` branch on this repository. They trigger our CI system which will automatically rebuild and redeploy <https://dev.tcgone.net> with the latest code on `master`. The progress status can be seen on Github commit which will display a status and a link that shows the build log, which can be checked for a possible error. A 'successful' build does not mean the new code will work in runtime though, so please test ALL cards by invoking ALL of their effects on [dev](https://dev.tcgone.net).
- This eternal project is in need of dedicated programmers to implement new sets, fix bugs and maintain the cards. Those who have proved their dedication are invited to the main repository and become TCG ONE developer with super powers.

### The process
1. Please read and understand [card definitions] below.
1. Please fully [read the wiki](https://github.com/axpendix/tcgone-engine-contrib/wiki) to understand about the Engine and its definitions.
1. Please check out existing [implementations](https://github.com/axpendix/tcgone-engine-contrib/tree/master/src/tcgwars/logic/impl).
1. Decide on what you're going to contribute. You may help us figuring and thinning out the [bug reports](https://forum.tcgone.net/c/bug-reports?solved=no) reported by our members, implement missing sets, check out [ideas & suggestions](https://forum.tcgone.net/c/ideas-n-suggestions/6), [uservoice idea portal](https://tcgone.uservoice.com/), [trello board](https://trello.com/b/B8bwBnRv/tcg-one-tasks) for some inspiration.
1. You may ping @developer in [#dev](https://discord.gg/JZP2qzU) to also ask any questions regarding implementations and contribution.
1. Please fork this repository, commit your changes to your fork, then submit a pull request to `master`, wait for it to get merged.
1. We will review your request and merge your changes to master. Please read and adhere to **Repository Rules** below or your request might be rejected.
1. After your changes are merged to `master`, go to <https://dev.tcgone.net> and test your changes, fix any bugs that you encounter with additional commits.

### Card definitions
In TCG ONE, cards are defined in two places: 

1. [cards](https://github.com/axpendix/tcgone/tree/master/cards)
- Defines card model,
- Holds static information about expansions, i.e. name and abbreviation of collections and name, number, card type, color, hp, moves, abilities, etc of their cards in YAML form
- Features scripts that allow recognizing from other card sources (e.g. pokemontcg.io), eases retrieval and preparation TCG ONE cards yaml files.
- Supplies cards data on <https://tcg.one/cards>.

2. [tcgone-engine-contrib](https://github.com/axpendix/tcgone-engine-contrib/) holds Groovy card implementations [in this directory](https://github.com/axpendix/tcgone-engine-contrib/tree/master/src/tcgwars/logic/impl). 
- A new file needs to be generated for each expansion. Don't forget to define a corresponding value in `Collection` enum for each new expansion. Please give attention to the existing naming convention of file/type names.
- Some legacy sets are situated inside the (closed-source) TCG ONE Engine. You may understand which sets are open source by checking [`Collection.java`](https://github.com/axpendix/tcgone-engine-contrib/blob/master/src/tcgwars/logic/card/Collection.java) and searching this repository for a class named as the value of `enumClassName` field.
- The process to implement new sets can be sped up by converting from a YAML file into implementation template (see `--export-impl-tmpl` flag of [`tools`](https://github.com/tcgone/carddb/tree/master/tools) repo). This template makes the development process extremely quick, the developer only needs to implement the actual effect bodies of each card in that set, where the static attributes are automatically filled in.
- For a new set, the most logical process is to first generate its YAML template (possibly by using scraping tools provided in `carddb`), generate its impl-tmpl, implement effects in Groovy, submit PR for review, test it on Developer UI, and so on.

### Putting it live

- In order for a new set to be live in production server <https://play.tcgone.net>, a member of the TCG ONE Developer Team needs to approve your contribution and execute Github Action to deploy to production. New sets need to be added into at least one active [Game Format](https://tcgone.net/formats) to be useful.
- Once you believe a new set on Developer UI runs totally fine enough to be released, announce your request by pinging @developer in our Discord's #dev room.

### Repository Rules

- NO MERGE COMMITS! Please always run `git pull --rebase --autostash` to get changes from the server.
- Please DO NOT commit any other file than card implementation files like metadata files, IDE garbage, etc, your merge request will not be accepted.
- Please DO NOT let your IDE/editor to push any other whitespace/indentation ruling than what's defined in `src/.editorconfig`. [ref](https://editorconfig.org/)
- Contributions to this repository automatically grant full and irrevocable permission of ALL RIGHTS to axpendix and TCG ONE. Check out LICENSE for more information. 

[return-to-contribution-guide](https://forum.tcgone.net/t/26)
