<h1 align="center"> Conway's Game Of Life</h1>
<p align="center">
    <img alt="Happy App into notebook" src="https://dl.dropboxusercontent.com/s/oxe1wjsjb2zloh5/gameOfLife.png?dl=0" height="380px">
    <br>
    <img alt="GitHub language count" src="https://img.shields.io/github/languages/count/lobophf/conway-game-of-life">
    <img alt="Issues" src="https://img.shields.io/github/issues/lobophf/conway-game-of-life.svg">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/lobophf/conway-game-of-life">
    <img alt="License" src="https://img.shields.io/badge/license-MIT-brightgreen"> 
    <br>
    <a href="#computer-about">About</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;
    <a href="#hammer_and_wrench-compiling">Compiling</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;
    <a href="#gear-using">Using</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;
    <a href="#balance_scale-license">License</a>	
</p>

## :computer: About:
This application is a Java GUI implementation of Conway's Game of Life. To know more about this topic, please see [this](https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life) page. Also, you can do as I did and get additional information by checking [John's](https://twitter.com/caveofjohn?lang=en) course on [Udemy](https://www.udemy.com/course/java-11-complete-beginners/).

## :hammer_and_wrench: Compiling:
First, clone this repository and jump into the conwayGameOfLife folder.

```sh
$ git clone git@github.com:lobophf/conway-game-of-life.git 
$ cd conway-game-of-life
```
Once you've done it, compile the code.
```sh
$ javac -d build src/App.java src/gui/*.java src/model/*.java 
```
## :gear: Using:
Stay in the `conway-game-of-life` folder, and run the following command, including the `classpath` flag:

```sh
$ java -classpath build App
```
When a window appears, press `Enter` to add live cells at random places. Also, you can click on the cells to toggle its states. To clean up the grid, press `Backspace`.

## :balance_scale: License:
This application is a MIT licensed, as found in the [LICENSE](./LICENSE) file.
