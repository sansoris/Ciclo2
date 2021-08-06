public class Lasanas {
        // Constantes
        private final static double PRECIOBASE = 20000.0;
        private final static  String SABOR = "pollo";
        private final static  String TAMANO = "1_porcion";

        // Atributos
        private String sabor;
        private String tamano;
        private Double precioBase;

        // Constructores
        public Lasanas(){
            this.sabor = SABOR;
            this.tamano = TAMANO;
            this.precioBase = PRECIOBASE;
        }

        public Lasanas (double precioBase) {
            this.sabor = SABOR;
            this.tamano = TAMANO;
            this.precioBase = precioBase;
        }

        public Lasanas (double precioBase, String tamano) {
            this.sabor = SABOR;
            this.tamano = tamano;
            this.precioBase = precioBase;
        }

        public Lasanas (String sabor) {
            this.sabor = sabor;
            this.tamano = TAMANO;
            this.precioBase = PRECIOBASE;
        }

        public Lasanas(String sabor, String tamano) {
            this.sabor = sabor;
            this.tamano = tamano;
            this.precioBase = PRECIOBASE;
        }


        public Lasanas(String sabor, String tamano, double precioBase) {
            this.sabor = sabor;
            this.tamano = tamano;
            this.precioBase = precioBase;
        }



        public String getSabor() {
            return sabor;
        }

        public void setSabor(String sabor) {
            this.sabor = sabor;
        }

        public String getTamano() {
            return tamano;
        }

        public void setTamano(String tamano) {
            this.tamano = tamano;
        }

        public double getPrecioBase() {
            return precioBase;
        }

        public void setPrecioBase(double precioBase) {
            this.precioBase = precioBase;
        }

        

        //Métodos
        public double calcularPrecio() {
            
            double parcial = 0.0;

            if (sabor.equals("carne")){  
                parcial += (precioBase*0.3);
            }else if (sabor.equals("pollo")){
                parcial += (precioBase*0.2);
            }else if(sabor.equals( "camarones" )){
                parcial += (precioBase*0.4);
            }else if(sabor.equals( "espinaca" )){
                parcial += (precioBase*0.1);
            } 
            
            
            if (tamano.equals("1_porcion" )){  
                parcial += 2000.0;
            }else if (tamano.equals("4_porciones")){
                parcial += 6000.0;
            }else if(tamano.equals("12_porciones" )){
                parcial += 15000.0;
            }
            
            return precioBase  + parcial;
        }
}
