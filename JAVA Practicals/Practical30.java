import java.awt.*;

import java.awt.event.*;


/*<applet code = Practical25 width=400 height=200>

</applet>

*/


public class Practical30 extends Frame{


    private String msg;

    private Panel labelPanel;

    private Label msglabel;

    private volatile boolean shouldRun = true;

    private Button start;

    private Button stop;

    Practical30(String title){

        super(title);

        msg = "JAVA ROCKS ";

        labelPanel = new Panel();

        msglabel = new Label(msg);

        start = new Button("Start");

        stop = new Button("stop");

    }

    

    public static void main(String[] args) {

        Practical30 app = new Practical30("Banner");

        app.init();

        app.start();

    }


    public void init(){

        setLayout(new GridBagLayout());

        msglabel.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,40));

        msglabel.setForeground(Color.RED);

        setSize(new Dimension(400,300));

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;

        gbc.gridy = 0;

        gbc.weighty = 0.10;

        gbc.weightx = 0.10;

        gbc.gridwidth = 4;

        labelPanel.add(msglabel);

        add(labelPanel,gbc);

        gbc.gridy++;

        gbc.gridx = 0;

        gbc.gridwidth = 2;

        add(start,gbc);

        gbc.gridx+=2;

        add(stop,gbc);

        addWindowListener(new WindowAdapter(){

            public void windowClosing(WindowEvent e) {

                System.exit(0);

            }

        });

        start.addActionListener((ae) -> {

            startMoving();

        });

        stop.addActionListener((ae) -> {

            stopMoving();

        });

    }


    public void start(){

        Thread runner = new Thread(() -> {

            try{

                while(true) {

                    if(!shouldRun)

                        continue;

                    msg = msg.substring(1)+msg.charAt(0);

                    Thread.sleep(250);

                    repaint();

                }

            } catch (InterruptedException e) { /* nothing to do */}

        });

        runner.start();

        setVisible(true);

    }


    public void stopMoving(){

        shouldRun = false;

    }


    public void startMoving() {

        shouldRun = true;

    }


    @Override

    public void paint(Graphics graphics) {

        msglabel.setText(msg);

    }

} 

