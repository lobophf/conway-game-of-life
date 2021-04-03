<p align="center">
    <img alt="Happy App into notebook" src="https://dl.dropboxusercontent.com/s/oxe1wjsjb2zloh5/gameOfLife.png?dl=0" height="380px" />
</p>

## :computer: About:
This application is a Java GUI implementation of Conway's Game of Life. To know more about this topic, please see [this](https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life) page. Also, you can do as I did and get additional information by checking [John's](https://twitter.com/caveofjohn?lang=en) course on [Udemy](https://www.udemy.com/course/java-11-complete-beginners/).

## :hammer_and_wrench: Compiling:
First, clone this repository and jump into the conwayGameOfLife folder.

```sh
$ git clone git@github.com:lobophf/conwayGameOfLife.git 
$ cd conwayGameOfLife
```
Once you've done it, compile the code.
```sh
$ javac -d build src/App.java src/gui/*.java src/model/*.java 
```
## :gear: Using:
Stay in the conwayGameOfLife folder, and run the following command, including the classpath flag:

```sh
$ java -classpath build App
```
When a window appears, press `Enter` to add live cells at random places. Also, you can click on the cells to toggle its states. To clean up the grid, press `Backspace`.

## :balance_scale: License:
This application is a MIT licensed, as found in the [LICENSE](./LICENSE) file.
