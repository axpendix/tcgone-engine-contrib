## pokemod package

This directory (package) holds [Pokémod expansion](https://forum.tcgone.net/t/pokemod-main-menu/22) card implementations. It was designed by ZF_Goku to balance classic cards for a better play experience and we aim to bring it to TCG ONE.

We shall start implementing Pokemod Base Set to Team Rocket, see these links to view modded cards: 
[[Pokémod - Base Set](https://forum.tcgone.net/t/pokemod-base-set/35/2)], 
[[Pokémod - Jungle](https://forum.tcgone.net/t/pokemod-jungle/37/2)], 
[[Pokémod - Fossil](https://forum.tcgone.net/t/pokemod-fossil/54/2)], 
[[Pokémod - Team Rocket](https://forum.tcgone.net/t/pokemod-team-rocket/55)]

The modded cards slightly differ from its original counterparts, therefore we need to implement and/or copy the cards in this package.

For all `Pokemod*.groovy` files, do the following;

1. Append collection number to all enum names. Example: `ALAKAZAM` to `ALAKAZAM_1`. Remember to change them in below get implementation also.  
1. Change `getCollection` method to either return `POKEMOD_BASE_SET, POKEMOD_JUNGLE, POKEMOD_FOSSIL, POKEMOD_TEAM_ROCKET` .
1. Add NEW cards to enum constants.
1. For UNMODIFIED cards, replace `getImplementation` method with a copy from original set, like: `return copy(BaseSet.XYZ, this)` . This is to prevent duplication of code.
1. For MODIFIED cards, edit the code to apply the modification. ZF_Goku can help pointing out what has changed.
1. For NEW cards, implement them from scratch following [the guidelines](https://github.com/axpendix/tcgone-engine-contrib).

Please ping #dev in Discord if you get stuck or for more information, thanks!
