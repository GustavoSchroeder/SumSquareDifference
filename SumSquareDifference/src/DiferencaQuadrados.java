import javax.swing.JOptionPane;


public class DiferencaQuadrados {
	private int sumNumberSquare;
	private int totalNumberSquare;
	private int sumTotalNumberSquare;
	
	public DiferencaQuadrados(){
	}
	
	public void sum(){
		int diferenca;
		for(int i = 0; i<101; i++){
			sumNumberSquare += (i*i);
			System.out.println("Soma do quadrado: " + i + " |||     Quadrado -> " + i*i);
			totalNumberSquare += i;
		}
		/*System.out.println(sumNumberSquare);
		System.out.println(totalNumberSquare);*/
		diferenca = (totalNumberSquare*totalNumberSquare) - sumNumberSquare;
		
		JOptionPane.showMessageDialog(null, "Diferença entre o quadrado da soma dos número e cada quadrado somado: \n" + diferenca);
	}
	
	public static void main(String [] args){
		DiferencaQuadrados dq = new DiferencaQuadrados();
		dq.sum();
	}
}
