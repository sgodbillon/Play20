package play.test;
/**
 * provides helpers to deal with results
 *
 */
public abstract class Extract {
   
   /**
    * extract useful response data from a controller result
    * @param the result usually generated by a controller call
    * @return ResultData that contains status, headers and body
    *
    */
   public static play.api.test.ResultData from(play.api.mvc.Result result) {
     return play.api.test.Extract.fromAsJava(result);
   }
       
}
