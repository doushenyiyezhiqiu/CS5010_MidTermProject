package cs5010.nbadatamanagementsystem;

import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

/**
 * A custom cell factory for JavaFX TableView that centers the content of each cell.
 * This class implements the Callback interface and is generic, allowing it to be used
 * with different types of data in the table columns.
 *
 * @param <T> The type of the items contained within the TableView's items list.
 * @param <E> The type of the items contained within the TableColumn.
 */
public class CenteredCellFactory<T, E> implements Callback<TableColumn<T, E>, TableCell<T, E>> {

    /**
     * Called when a table cell needs to be created. It returns a TableCell that
     * is centered horizontally.
     *
     * @param param The TableColumn instance for which the cell is created.
     * @return A TableCell with centered content.
     */
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

