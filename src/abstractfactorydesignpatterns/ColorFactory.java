package abstractfactorydesignpatterns;
public class ColorFactory extends AbstractFactory{

    @Override
    Color getColor(String color) {
        
          if(color == null){
         return null;
      }		
      
      if(color.equalsIgnoreCase("RED")){
         return new Red();
         
      }else if(color.equalsIgnoreCase("GREEN")){
         return new Green();
         
      }
      
      return null;
    }

    @Override
    Shape getShape(String shape) {
return null;    }

}
