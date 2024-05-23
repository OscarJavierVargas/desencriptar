package desencriptar;

public class DesencriptarFrace {
	
	
	public String desencriptar (String text) {

	String tex = text;
	//String tex="147258369";
	int longi = tex.length();

	System.out.println(longi);
	String ordenado = "";
	int j=23;
	int k=47;
	
	for (int i =0; i < 24; i++) {
		j++;
		k++;
		ordenado = ordenado + tex.charAt(i);
		
		for (  ; j < 48; j++) {
			ordenado = ordenado + tex.charAt(j);
			
			 break;
		}
			for (  ; k < 72; k++) {
				ordenado = ordenado + tex.charAt(k);
				 break;
			}
				
			}
				

	System.out.println(ordenado);
 return ordenado;
	}
	
//	********
	
	public String cesar (String code) {
	String texto=code;
	
	String alfabeto="wxyzabcdefghijklmnopqrstuvwxyz    _";
	
	
	int lonTex=texto.length();
	int lonAlfabe=alfabeto.length();
    
	System.out.println(lonTex);
	System.out.println(lonAlfabe);
	String contruccion="";
	char letra;
	char letraAlfA;
	for(int i=0; i<lonTex; i++) {
		letra=texto.toLowerCase().charAt(i);
		for(int j=34; j>3; j--) {
			int m;
			letraAlfA=alfabeto.charAt(j);
			if(letra==letraAlfA) {
				m=j-3;
				contruccion=contruccion+alfabeto.charAt(m);	
			}
		
			
		}
	}
	System.out.println(contruccion);
	return contruccion;
	}
//	**********
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String tex="HLWWGWHGHBDQOHLGSWW_UHGOOQLRLDOHU__WLQDDUHRSDOLR_VQ_F__E_OLHJF__HAVD_XU_";

DesencriptarFrace dsf= new DesencriptarFrace();
 String prierFase =dsf.desencriptar(tex);
 dsf.cesar(prierFase);
	}

}
