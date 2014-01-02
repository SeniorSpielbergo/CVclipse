package de.tu_bs.cs.isf.mbse.cvclipse

class M2T {
	ModelLoader m;
	Application app; 
	def generate(String folder) {
		app = m.loadModel(folder);
		
	}
}