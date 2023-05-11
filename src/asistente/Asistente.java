
 
package asistente;
 
import javax.speech.*;
import javax.speech.recognition.*;
import java.io.FileReader;
import java.util.Locale;
import com.sun.speech.freetts.VoiceManager;
import com.sun.speech.freetts.Voice;
import java.awt.Robot;
import java.awt.event.KeyEvent;


 
public class Asistente extends ResultAdapter
{
    
 
 static Recognizer recognizer;
 String gst;
 
 @Override
 public void resultAccepted(ResultEvent re)
 {
//DECLARACION DE VOZ------------------------------------------------------------
        VoiceManager manager = VoiceManager.getInstance();
            Voice voz= manager.getVoice("kevin16");
            voz.allocate();
       //  voz.speak("Hi");
//------------------------------------------------------------------------------
//--------------------try cacth 1-----------------------------------------------
 try
 {
 Result res = (Result)(re.getSource());
 ResultToken tokens[] = res.getBestTokens();
 
 String args[]= new String[1];
 args[0]="";
 //----------------------for 1--------------------------------------------------
 for (int i=0; i < tokens.length; i++)
 {
 gst = tokens[i].getSpokenText();
 args[0]+=gst+" ";
 System.out.print(gst + " ");
 }
//------------------------------------------------------------------------------
//System.out.println();
 
 //**********************************************************************************
        if(gst.equals("Adios"))
        {
        recognizer.deallocate();
        //args[0]="Bye Bye";
        //System.out.println(args[0]);
        voz.speak("Good bye");
        voz.deallocate();
     System.exit(0);
    }
        else
 //**********************************************************************************
        if(gst.equals("Hola"))
        {
            
        recognizer.allocate();
        voz.speak("Hello, how are you?");
        //System.out.println("Hola que tal");
        voz.deallocate();
         }
            else
//***********************************************************************************
      
        if(gst.equals("Nombre"))
        {
        recognizer.allocate();
        voz.speak("My name is Tom, and I am a robot");
        //System.out.println("Hola que tal");
        voz.deallocate();
        }
           else
//**********************************************************************************
      
        if(gst.equals("Clima"))
        {
        recognizer.allocate();
        voz.speak("I don't know, but it's cold");
        //System.out.println("Hola que tal");
        voz.deallocate();
        }
            else
//**********************************************************************************
      
        if(gst.equals("Spanish"))
        {
        recognizer.allocate();
        voz.speak("I'm sorry I do not speak spanish");
        //System.out.println("Hola que tal");
        voz.deallocate();
        }
            else
//**********************************************************************************
            
        if(gst.equals("Hora"))
        {
        recognizer.allocate();
        voz.speak("I don't know, but it's still day");
        //System.out.println("Hola que tal");
        voz.deallocate();
        }
            else
//**********************************************************************************
   
        if(gst.equals("Canta"))
        {
        recognizer.allocate();
        voz.speak("I shine my wrist it go like cha,cha,sha, ,cha,sha,sha\n" +
        "I got your bitch singing me la,la,la, ,la,la,la\n" +
        "I shine my wrist it go like cha,cha,cha, ,cha,cha,cha\n" +
        "I got your bitch singing that la,la,la, ,la,la,la\n" +
        "How I stride like that?");
         //System.out.println("Hola que tal");
        voz.deallocate();
        }
             else
//**********************************************************************************
      
        if(gst.equals("Rie"))
        {
        recognizer.allocate();
        voz.speak("ha ha ha ha");
        //System.out.println("Hola que tal");
        voz.deallocate();
        }
             else
//**********************************************************************************
      
         if(gst.equals("Chiste"))
        {
        recognizer.allocate();
        voz.speak("What did one wall say to the other wall?,,,\n" +
        "What?\n" +
        "I'll meet you at the corner!\n" +
        "Bah    dum     tish"
         + "ha ha ha ha LMAO");
        //System.out.println("Hola que tal");
        voz.deallocate();
        }
        /*
         ¿Qué le dijo una pared a otra pared?
         ¿Qué?
         Te veo en la esquina!
         */
             else
//**********************************************************************************
         if(gst.equals("Recordatorio"))
        {
        recognizer.allocate();
        voz.speak("Today you, have research project delivery");
        //System.out.println("Hola que tal");
        voz.deallocate();
        }
            else
//**********************************************************************************
// COMANDOS DE VOZ -----------------------------------------------------------------
       
        if(gst.equals("play"))
        {
        Robot robot=new Robot();
 
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_8);
   
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_8);
        }       
            else
//**************************************************************************************************************************
         if(gst.equals("pausarmusica") )
        {
        Robot robot=new Robot();
 
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_8);
   
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_8);
        }       
            else
//**********************************************************************************
        if(gst.equals("siguientecancion")){
        Robot robot=new Robot();
 
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_3);
   
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_3);
 
        }
             else
//**********************************************************************************
 
        if(gst.equals("cancionanterior")){
        Robot robot=new Robot();
 
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_6);
   
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_6);
     
        }
            else
//**********************************************************************************
        if(gst.equals("silencio")){
        Robot robot=new Robot();
        for(int i=0;i<100;i++){
 
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_4);
   
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_4);
        }
        }
            else 
//**********************************************************************************
        if(gst.equals("volumenmaximo")){
 
        Robot robot=new Robot();
        for(int i=0;i<100;i++){
 
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_5);
   
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_5);
        }
        }
//**********************************************************************************
//FIN DE COMANDOS ------------------------------------------------------------------


 {
 recognizer.suspend();

 recognizer.resume();
 }
 }catch(Exception ex)
 {
 System.out.println("Ha ocurrido algo inesperado " + ex);
 }
 
 }
 
 public static void main(String args[])
 {
     
 try
 {
 recognizer = Central.createRecognizer(new EngineModeDesc(Locale.ROOT));
 recognizer.allocate();
 
 FileReader grammar1 =new FileReader("libreria/diccionario.txt");
 
 RuleGrammar rg = recognizer.loadJSGF(grammar1);
 rg.setEnabled(true);
 
 recognizer.addResultListener(new Asistente());
 
 System.out.println("Empieze Dictado");
 recognizer.commitChanges();
 
 recognizer.requestFocus();
 recognizer.resume();
 }catch (Exception e)
 {
 System.out.println("Exception en " + e.toString());
 e.printStackTrace();
 System.exit(0);
 }
 
 }
}