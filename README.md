# The Expanded Signs Pack
![](https://raw.githubusercontent.com/Tim3Game/The-Expanded-Signs-Pack/1.10.2/src/main/resources/packLogo.png)

![](https://img.shields.io/github/issues/Tim3Game/The-Expanded-Signs-Pack?style=flat-square) ![](https://img.shields.io/github/stars/Tim3Game/The-Expanded-Signs-Pack?style=flat-square) ![](https://img.shields.io/github/forks/Tim3Game/The-Expanded-Signs-Pack?style=flat-square ) ![](https://img.shields.io/github/release/Tim3Game/The-Expanded-Signs-Pack?style=flat-square)
![](https://cf.way2muchnoise.eu/full_333267_downloads.svg) ![](https://cf.way2muchnoise.eu/versions/333267.svg)
##Announcement
This version (1.10.2) is no longer updated, please use the newest if you can't.

## How is the pack updated
I will look once in a while, if there are some new signs added, and if, then I export a new jar and add it to [Releases](https://github.com/Tim3Game/The-Expanded-Signs-Pack/releases "Releases") and on [Curse](https://www.curseforge.com/minecraft/mc-mods/the-expanded-signs-pack-iv-mts "Curse"). If you want, you can fork or download this repo and export it your self, but you can't reupload it on Curse or elsewhere, but you can, for instance, send it to your friends or use it on your server/modpack with respective credits.

## How to contribute
### Forking
You simply fork it, what's hard on that ?
### Adding new Signs
##### Handbook
Firstly, if you don't know, how to add anything to a Immersive Vehicles Pack, read this [Handbook](https://github.com/DonBruce64/MinecraftTransportSimulator/blob/master/MTSPackHandbook.doc "this Handbook") (mainly 10.\*.\* Signs (Textures & JSON)).
##### Paths
```yaml
` sk_detour_left_arrow_text `
sk = the ISO 3166 of the country from where the sign is (ex. SK, AT, IR, ...)
detour = the "name" of the sign (ex. detour, motorway, ...)
and then things to define the the sign, in this example:
left_arrow_text = the sign is a Detour Traffic Sign with the city which is redirected and the direction in what it is going
```


### Multipart sign grid
This pack is using the [alphanumeric grid (atlas grid)](https://en.wikipedia.org/wiki/Alphanumeric_grid "alphanumeric grid (atlas grid)") for signs placement. That means, that for instance if you have a 3x2 (width X height) that the top left part is A1 and the bottom right is C2 and so on. You can find more on [Wikipedia](https://en.wikipedia.org/wiki/Alphanumeric_grid "Wikipedia")