/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package neos;

/**
 *
 * @author marcos
 */
import org.neos.client.ResultCallback;

public class JobReceiver implements ResultCallback {
   public void handleJobInfo(int jobNo, String pass) {
      System.out.println("Job Number : " + jobNo);
      System.out.println("Password   : " + pass);
      System.out.println("Download results in http://www.neos-server.org/neos/admin.html");
   }	
   public void handleFinalResult(String results) {
      System.out.println(results);
   }
}
