package per.projects.pk;

public class App {
    public static void main(String[] args){
        Menu menuInstance = new Menu();
        Table tableInstance = new Table();
        Table table=menuInstance.mainMenu(tableInstance);
    }
}
