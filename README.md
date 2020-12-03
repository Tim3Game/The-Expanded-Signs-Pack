# TESP - TheExpandedSignsPack
![](https://raw.githubusercontent.com/Tim3Game/The-Expanded-Signs-Pack/1.12.2_2/_git/banner.png)

![](https://img.shields.io/github/issues/Tim3Game/The-Expanded-Signs-Pack?style=flat-square) ![](https://img.shields.io/github/stars/Tim3Game/The-Expanded-Signs-Pack?style=flat-square) ![](https://img.shields.io/github/forks/Tim3Game/The-Expanded-Signs-Pack?style=flat-square ) ![](https://img.shields.io/github/release/Tim3Game/The-Expanded-Signs-Pack?style=flat-square)
![](https://cf.way2muchnoise.eu/full_333267_downloads.svg) ![](https://cf.way2muchnoise.eu/versions/333267.svg)

## How is the pack updated
I will look once in a while, if there are some new signs added, and if, then I export a new jar and add it to [Releases](https://github.com/Tim3Game/The-Expanded-Signs-Pack/releases "Releases") and on [Curse](https://www.curseforge.com/minecraft/mc-mods/the-expanded-signs-pack-iv-mts "Curse"). If you want, you can fork or download this repo and export it your self, but you can't reupload it on Curse or elsewhere, but you can, for instance, send it to your friends or use it on your server/modpack with respective credits.

## How to contribute
### Forking
You simply fork it, easy as that

#### Handbook
Firstly, if you don't know, how to add anything to a Immersive Vehicles Pack, read this [Handbook](https://github.com/DonBruce64/MinecraftTransportSimulator/blob/master/MTSPackHandbook.doc "this Handbook").
### Adding new Signs
##### Paths
```markdown
`sign_street_name_direction`
sign = type of object (sign, item, ...)
street = category (*none*, street, highway, led, ...)
name_direction = name of object
```
**or**
```markdown
`sign_steet_sk_city_enter`
sign = type of object (sign, item, ...)
street = category (*none*, street, highway, led, ...)
sign = country of origin (sk, cz, hu, pl, ...)
city_enter = name of object
```