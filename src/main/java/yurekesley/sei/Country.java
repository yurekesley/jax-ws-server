package yurekesley.sei;

import javax.jws.WebMethod;
import javax.jws.WebService;

/* Service Endpoint Interface (SEI) */

@WebService
public interface Country {
 
    @WebMethod
    String getCapital(String s);
 
    @WebMethod
    String getLanguages(String s);
 
    @WebMethod
    String getAirports(String s);
 
    @WebMethod
    int getDistricts(String s);
 
    @WebMethod
    String getPlacesToVisit(String s);
 
    @WebMethod
    String getInterestingFacts(String s);
}