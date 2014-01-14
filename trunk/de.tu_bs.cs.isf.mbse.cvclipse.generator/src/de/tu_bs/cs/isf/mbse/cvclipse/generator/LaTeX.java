package de.tu_bs.cs.isf.mbse.cvclipse.generator;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LaTeX {
	
	public static void runLaTeX(List<String> inputs) throws IOException {
		boolean error = false;
		
		for (String path : inputs) {
			List<String> command = new ArrayList<String>();
			command.add("/usr/local/texlive/2013/bin/x86_64-linux/pdflatex");
			command.add("--halt-on-error");
			command.add(path);

			File f = new File(path);
			ProcessBuilder builder = new ProcessBuilder(command);
			builder.directory(new File((f.getParent())));

			final Process process = builder.start();
			InputStream is = process.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String line;
			while ((line = br.readLine()) != null) {
				if (line.contains("Fatal error occurred, no output PDF file produced!")) {
					Console.println("An error occured, while generating \"" + f.getName().replace("tex", "pdf") + "\"!");
					error = true;
				}
			}
			
			if (!error) {
				Console.println("Generated \"" + f.getName().replace("tex", "pdf") + "\"!");
			}
			
			File aux = new File(path.replace("tex", "aux"));
			aux.delete();
			
			File log = new File(path.replace("tex", "log"));
			log.delete();
			
			File out = new File(path.replace("tex", "out"));
			out.delete();
		}
	}
}
