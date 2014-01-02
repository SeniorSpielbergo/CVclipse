package de.tu_bs.cs.isf.mbse.cvclipse;

import de.tu_bs.cs.isf.mbse.cvclipse.Application;
import de.tu_bs.cs.isf.mbse.cvclipse.ModelLoader;

@SuppressWarnings("all")
public class M2T {
  private ModelLoader m;
  
  private Application app;
  
  public Application generate(final String folder) {
    Application _loadModel = this.m.loadModel(folder);
    Application _app = this.app = _loadModel;
    return _app;
  }
}
