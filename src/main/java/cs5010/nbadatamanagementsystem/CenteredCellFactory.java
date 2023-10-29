package cs5010.nbadatamanagementsystem;

import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

public class CenteredCellFactory<T, E> implements Callback<TableColumn<T, E>, TableCell<T, E>> {
    @Override
    public TableCell<T, E> call(TableColumn<T, E> param) {
        return new TableCell<>() {
            @Override
            protected void updateItem(E item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText(null);
                } else {
                    setText(item.toString());
                    setStyle("-fx-alignment: CENTER;");
                }
            }
        };
    }
}

