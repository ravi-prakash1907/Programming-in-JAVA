import java.awt.*; 
import java.awt.event.*; 
import java.applet.Applet; 
/* <APPLET CODE ="ChoiceListControl.class" WIDTH=300 HEIGHT=200> </APPLET> */ 
public class ChoiceListControl extends Applet implements ItemListener 
  { 
       List ls; 
       Choice choice; 
       Label lb1,lb2,lb3; 
       TextField t; 
       Button b1; 
       public void init() 
          {   
               setLayout(new BorderLayout()); 
               Panel p1= new Panel(); 
               Panel p2= new Panel(); 
               p1.setLayout(new GridLayout(2,2)); 
               p2.setLayout(new GridLayout(1,1)); 
               lb1=new Label("Select an Option"); 
               p1.add(lb1); 
               choice =new Choice(); 
               choice.addItem("Snacks"); 
               choice.addItem("Drinks");
               choice.addItemListener(this); 
                     p1.add(choice);            
                lb2=new Label("What you want to have"); 
                p1.add(lb2); 
                ls=new List(4,true); 
                p1.add(ls); 
                ls.add("Pastry...8"); 
                ls.add("French Fries...20"); 
                ls.add("Burger...15"); 
                ls.add("Dosa...20"); 
                ls.addItemListener(this);
                lb3=new Label("Your Bill is"); 
                p2.add(lb3); 
                t=new TextField(20); 
                p2.add(t); 
                add(p1,BorderLayout.NORTH); 
                add(p2,BorderLayout.SOUTH); 
          }   
               public void itemStateChanged(ItemEvent e) 
                  { 
                     int amt,i; 
                     String st[]= new String[4]; 
                     amt=0; 
                     if(e.getSource()==choice) 
                        { 
                          if(choice.getSelectedItem()=="Snacks")
                            { 
                               ls.removeAll(); 
                               ls.add("Pastry...8"); 
                               ls.add("French Fries...20"); 
                               ls.add("Burger...15"); 
                               ls.add("Dosa...20"); 
                             } 
                               else 
                                { 
                                   ls.removeAll();
                                   ls.add("Coffee...12"); 
                                   ls.add("Cola...12"); 
                                   ls.add("Tea...5"); 
                                   ls.add("Juice...15"); 
                                } 
                      } 
                            else 
                             { 
                                 st=ls.getSelectedItems(); 
                                 for(i=0;i<st.length;i++) 
                                     { 
                                        if(st[i].equals("Pastry..8"))
amt=amt+8; 

if(st[i].equals("French Fries..20"))
amt=amt+20;
                                            if(st[i].equals("Burger..15"))
amt=amt+15;
                                            if(st[i].equals("Dosa..20"))
amt=amt+20; 

if(st[i].equals("Coffee..12"))
amt=amt+12; 

if(st[i].equals("Cola..12"))
amt=amt+12; 
                                       if(st[i].equals("Tea..5"))
amt=amt+5;

if(st[i].equals("Juice..15"))
amt=amt+15; 
                    
}                                                                                                             t.setText(String.valueOf(amt)); 
                                }                                                              
                  }                                                                             
                                                                                                
   }              