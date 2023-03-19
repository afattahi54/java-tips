package tip.core;

import java.io.Serializable;

//The Serializable and Cloneable are interfaces but they do not have any method to be implemented
//There are called Marker Interfaces , the compiler used these to get some information about this class
//For example Serializable tells the container that you can write the objects from this class to a serlizer ex: disk
public class MarkerInterfaces implements Serializable, Cloneable{

}
