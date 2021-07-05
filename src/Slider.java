import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Slider implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JSlider slider1;
    JSlider slider2;
    JSlider slider3;


    public Slider() {

        frame = new JFrame("Slider Test");
        panel = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        slider1 = new JSlider(JSlider.VERTICAL,0,255,0);
        slider2= new JSlider(JSlider.VERTICAL,0,255,0);
        slider3 = new JSlider(JSlider.VERTICAL,0,255,0);

        slider1.setPreferredSize(new Dimension(150,300));
        slider1.setPaintTicks(true);
        slider1.setMinorTickSpacing(10);

        slider2.setPreferredSize(new Dimension(150,300));
        slider2.setPaintTicks(true);
        slider2.setMinorTickSpacing(10);

        slider3.setPreferredSize(new Dimension(150,300));
        slider3.setPaintTicks(true);
        slider3.setMinorTickSpacing(10);

        Font myFont = new Font("Arial",Font.TRUETYPE_FONT,15);


        slider1.setPaintTrack(true);
        slider1.setMajorTickSpacing(25);
        slider1.setPaintLabels(true);
        slider1.addChangeListener(this);
        slider1.setFont(myFont);

        slider3.setPaintTrack(true);
        slider3.setMajorTickSpacing(25);
        slider3.setPaintLabels(true);
        slider3.addChangeListener(this);
        slider3.setFont(myFont);

        slider2.setPaintTrack(true);
        slider2.setMajorTickSpacing(25);
        slider2.setPaintLabels(true);
        slider2.addChangeListener(this);
        slider2.setFont(myFont);
        label1.setForeground(Color.red);
        label2.setForeground(Color.green);
        label3.setForeground(Color.black);

        //slider.setOrientation(SwingConstants.VERTICAL); yuxarda qeyd etmisem



        label1.setText("RED is-> "+slider1.getValue());
        label1.setFont(new Font("MV Boli",Font.PLAIN,25));

        label2.setText("GREEN is-> "+slider2.getValue());
        label2.setFont(new Font("MV Boli",Font.PLAIN,25));

        label3.setText("BLACK is-> "+slider3.getValue());
        label3.setFont(new Font("MV Boli",Font.PLAIN,25));

        panel.add(slider1);
        panel.add(slider2);
        panel.add(slider3);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);

        panel.setBackground(new Color(0,0,0));
        frame.add(panel);
        frame.setSize(600,600);

        //Border margin = new EmptyBorder(100, 10, 5, 50);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label1.setText("RED -> "+slider1.getValue()+"  ");
        label2.setText("GREEN -> "+slider2.getValue()+"  ");
        label3.setText("BLACK -> "+slider3.getValue());
        panel.setBackground(new Color(slider1.getValue(),slider2.getValue(),slider3.getValue()));

    }
}

