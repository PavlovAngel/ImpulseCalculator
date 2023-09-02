package Frame;

import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.DefaultMetalTheme;
import java.awt.*;


    public class ChangeTheme extends DefaultMetalTheme {
        Color color = new Color(150, 187, 178);

        public ColorUIResource getWindowTitleInactiveBackground() {
            return new ColorUIResource(color);
        }

        public ColorUIResource getWindowTitleBackground() {
            return new ColorUIResource(color);


        }
        public ColorUIResource getPrimaryControlHighlight() {
            return new ColorUIResource(color);
        }

        public ColorUIResource getPrimaryControlDarkShadow() {
            return new ColorUIResource(color);
        }

        public ColorUIResource getPrimaryControl() {
            return new ColorUIResource(color);
        }

        public ColorUIResource getControlHighlight() {
            return new ColorUIResource(color);
        }

        public ColorUIResource getControlDarkShadow() {
            return new ColorUIResource(color);
        }

        public ColorUIResource getControl() {
            return new ColorUIResource(color);
        }
    }

