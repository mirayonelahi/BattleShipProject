# BattleShipProject
This is a battleship game using java and javafx.

The game is written in a Java program based on structured pattern Model-View-Controller (MVC) architecture.

![Picture1](https://user-images.githubusercontent.com/68749413/111858501-e88fc280-88f6-11eb-8294-7baa1ffb7fb2.jpg)

The main method (public void start(Stage primaryStage) throws Exception), which appears in the Main.java file, runs the functions defined in the other package’s files (Battleship.java and BattleshiController.java).

BattleshiController.java 

This is the main controller for Battleship Game and all the data is accessed from the user or model and logics are generated here.

![BattleshiController](https://user-images.githubusercontent.com/68749413/111858507-e9c0ef80-88f6-11eb-9d6a-4493cfbfffe7.png)

Battleship.java

This is the Battleship model where generate ship and those data will be handled here.

![BattleShip](https://user-images.githubusercontent.com/68749413/111858508-e9c0ef80-88f6-11eb-81b2-41cfed4acb38.png)

Here is the plan of the Battleship Game: -

Placing two ships (each ship takes up three cells on the board) on 10 by 11 grid.

After starting the game, user try to sink the ships by hitting the coordinates to "attack". 

![3](https://user-images.githubusercontent.com/68749413/111858505-e9c0ef80-88f6-11eb-83c2-9a91a4b9fd32.png)

Each ship has three locations, so user need to store three hits for each ship and User will notify with a message up in the top when they have sunk battleships.

![1](https://user-images.githubusercontent.com/68749413/111858503-e9285900-88f6-11eb-95c4-a54f7f067068.png)

User will get 20 chances to sink the ships.

![2](https://user-images.githubusercontent.com/68749413/111858504-e9285900-88f6-11eb-9728-d28043ca9e7b.png)

Window will automatically after showing the warning panel with the message (either user lost or win).

![4](https://user-images.githubusercontent.com/68749413/111858506-e9c0ef80-88f6-11eb-845f-9dca028f221b.png)
