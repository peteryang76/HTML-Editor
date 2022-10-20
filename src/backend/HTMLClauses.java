package backend;

import java.util.ArrayList;
import java.util.List;

public class HTMLClauses {

    private List<Component> componentList;
    public HTMLClauses() {
        componentList = new ArrayList<>();
    }

    public void performInsert(String component) {
        switch(component) {
            case "Table":
                Component table = Component.TABLE;
                componentList.add(table);
        }
    }
}
