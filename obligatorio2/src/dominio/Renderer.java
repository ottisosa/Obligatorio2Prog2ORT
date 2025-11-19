package dominio;

// Autores: Santiago Quintana (327886), Octavio Sosa (363131)
import javax.swing.*;
import java.awt.*;

public class Renderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(
            JList<?> list,
            Object value,
            int index,
            boolean isSelected,
            boolean cellHasFocus) {

        JLabel label = (JLabel) super.getListCellRendererComponent(
                list, value, index, isSelected, cellHasFocus);

        Area area = (Area) value;

        long porcentaje = area.porcentajeP();

        if (porcentaje >= 90 && !isSelected) {
            label.setBackground(Color.RED);
            label.setForeground(Color.BLACK);
            label.setOpaque(true);

        }

        if (porcentaje < 90 && porcentaje >= 70 && !isSelected) {
            label.setBackground(Color.YELLOW);
            label.setForeground(Color.BLACK);
            label.setOpaque(true);

        } else if (!isSelected) {
            label.setBackground(Color.GRAY);
            label.setForeground(Color.BLACK);
            label.setOpaque(true);

        }

        label.setText(area.getNombre() + " (" + (int) porcentaje + "%)");

        return label;
    }
}
