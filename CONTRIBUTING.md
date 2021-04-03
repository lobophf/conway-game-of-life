# Contributing to Conway's Game Of Life

First off, thanks for your interest in contributing! I appreciate the contributions of all types. See the table of contents for different ways to help and details about this project. These are mostly guidelines, not rules. So, use your best judgment, and feel free to propose changes, including in this document.

#### Table Of Contents
[What should I know before I get started?](#what-should-i-know-before-i-get-started)

[How Can I Contribute?](#how-can-i-contribute)
* [Reporting Bugs](#reporting-bugs)
* [Developing](#developing)

[Styleguides](#styleguides)
* [Git Commit Messages](#git-commit-messages)


## What should I know before I get started?
Conway's Game Of Life is a Java implementation that uses the Swing as a Graphical User Interface. This open-source project writes dead or live pixels on the screen, and after each grid update, its stages change, following some rules.    

## How Can I Contribute?
If you haven't already done so, read the [Code of Conduct](./CODE_OF_CONDUCT.md).
### Reporting bugs
If you run into an error or bug with the project:
* Open an issue at https://github.com/lobophf/conway-game-of-life/issues
* Include reproduction steps that someone else can follow to recreate the bug or error on their own.
* Provide details like operating system and compiler versions.

### Developing
So you wanna contribute! Awesome! This project uses GitHub to manage contributions, so you can fork this repository, make your changes, push your changes in a side branch, and finally create a pull request. However, if you wanna suggest new features, please contact me before start writing code, ok?

### Git Commit Messages
To commits messages, it would be nice if you used the template available in this repository. You can easily configure it using the command below:
```
$ git config --local commit.template .git-commit-template.txt
```
So, when you create a commit, don't use the "-m" or "--message" option. Just type the command below and wait for your editor to open. The template file contains other instructions. When you finished, save and close the file.
```
$ git commit
```
