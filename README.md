# TCG ONE Engine Contrib

This is TCG ONE's engine contribution repository. 
It is mainly used for storing open source card implementations. 
You are welcome to submit pull requests!

Please [read the wiki](https://github.com/axpendix/tcgone-engine-contrib/wiki) to understand about the engine.

### About TCG ONE

[TCG ONE](https://tcgone.net) is an Online Automated Pokémon Trading Card Game Simulator where players can gather online and play with their favorite cards in their respective formats. Its software is completely fan-made and is in no way affiliated with TPCI or its official game.

Some of its features are: Automated Game Mechanics, Online 1-1 play, Deck Editor, Lobby & Chat, Real Card Images, Multiple Game Formats (including Standard, Expanded and Classic Old School formats), Spectation, Game scoring system and Scoreboards, Career and Quickplay game modes, Personal Inventory, Assemble/Dissolve cards with ink, Leveling, Booster Pack simulator, Daily Quests and Achievements.

It went live on 18 July 2013 and is being actively developed and maintained. [more info](https://tcgone.net/about)

### Preliminaries

- We are using Groovy language to implement cards and their effects, with a custom designed DSL for it. It is basically a superset of Java, if you know Java than you'll easily get used to it.
- Open sourcing the entire project is a really big task due to its complexity. For now, you will only be able to test your changes remotely (not on your local machine). I plan to restructure and open source the entire game engine gradually.
- After every push to `master` branch, our CI system will automatically rebuild the code and update the commit status with the log. If everything goes well, it will deploy to <https://dev.tcgone.net>, our staging dev server, which can be used to test cards before going to production. It is a special UI that allows searching and adding any card directly into play. Try it now!
- If the build fails, you can check the logs via the status icon near every commit, first click the icon then click 'details'. A 'successful' build does not mean the code works, due to the dynamic nature of Groovy. Therefore, please test ALL cards by invoking ALL of their effects on [the dev server](https://dev.tcgone.net).
- [The production server](https://play.tcgone.net) is rolled out manually, therefore your changes will not be immediately visible in production.

### Instructions for a New Contributor

1. Please [read the wiki](https://github.com/axpendix/tcgone-engine-contrib/wiki).
1. Inspect [implementations of some sets](https://github.com/axpendix/tcgone-engine-contrib/tree/master/src/tcgwars/logic/impl) to understand more.
1. [Please join our Discord #dev room](https://discord.gg/JZP2qzU), ask any questions regarding implementations or contribution in there
1. Decide on what you're going to contribute. You can investigate [some bug reports](https://forum.tcgone.net/c/bug-reports) or work on missing sets.
1. Please fork this repository, commit your changes then submit a pull request to `master`.
1. I review your request and merge your changes to master. Please read and adhere to **Repository Rules** below or your request might be rejected.
1. After your changes are merged to `master`, go to <https://dev.tcgone.net> and test your changes, fix any bugs that you encounter with additional commits.
1. After you've submitted several good standing commits, I'll add you as a contributor so you'll be able to push directly to `master` branch. You will also get **developer** role in our Discord server and become a TCG ONE staff member!

### Repository Rules

- NO MERGE COMMITS! ALWAYS USE REBASE! Please always run `git pull --rebase --autostash` to get changes from the server, else you may litter the repository history.
- Please DO NOT commit any other file than card implementation files like metadata files, IDE garbage, etc, your merge request will not be accepted.
- Please also be careful to NOT let your IDE/editor to enforce some whitespace ruling to change whitespaces of files, it makes really hard to track real changes.
- Licensing: We are using Apache License 2.0 for the source code. You confirm you accept the terms the moment you send any contribution to the repository. 

### What to do next?

1. We usually have a lot of bugs to sort out, please go to <https://forum.tcgone.net/c/bug-reports> then start hunting them!

2. Start implementing Pokemod expansions under [pokemod package](https://github.com/axpendix/tcgone-engine-contrib/tree/master/src/tcgwars/logic/impl/pokemod).

3. Other than that, you may start looking at the missing [gen4 sets](https://github.com/axpendix/tcgone-engine-contrib/tree/master/src/tcgwars/logic/impl/gen4) and start coding!

[return-to-contribution-guide](https://forum.tcgone.net/t/26)
