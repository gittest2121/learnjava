# GUI for Java -- JavaFx
* init method -- defined in the Application class & for instance, used to initialize objects of a program.
* javafx.application.Application
* javafx.stage.Stage

* Structure -- Three Essential Parts<br>
1. Stage -- The Stage object behaves as a program's window.
2. Scene -- The Scene object is set for a Stage object that represents a scene within a window.<br>
On the other hand, The scene object contains an object responsible for arranging the components belonging to the scene (e.g. FlowPane), which contains the actual UI components.
3. UI Components are added as "children" to the object responsible for setting them - FlowPane. This is a JavaFx design decision, whereby each object responsible for UI components may contain other objects responsible for UI components may contain other objects responsible for UI components as well as actual UI components.

Recap:<br>
**1. The window contains a Scene object.
2. The Scene object contains the object responsible for the layout of the UI components.
3. The object responsible for the component layout can contain both UI components and objects responsible for UI component layouts**

# UI Components and their layout
1. Label Class
* Text can be displayed using Label class.
* The Label class provides a UI component for which text can be set, and offers methods for modifying the text it contains.
* The displayed text is either set in the constructor, or by using the ```setText``` method.
2. Button Class
3. TextField Class

6 Panes in Total (not sure!)
4. FlowPane Class -- add components side-by-side
5. BorderPane Class -- lets you lay out components in five different primary positions: top, right, bottom, left, center

6. HBox -- enables UI components to be laid out in a single horizontal row.
7. VBox -- single vertical row
Take care of gluing

8. GridPane -- Lay the UI components in a grid

