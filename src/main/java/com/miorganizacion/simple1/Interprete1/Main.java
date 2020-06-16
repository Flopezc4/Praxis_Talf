
package com.miorganizacion.simple1.Interprete1;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

	private static final String EXTENSION = "smp1";

	public static void main(String[] args) throws IOException {
		String program = args.length > 1 ? args[1] : "test/test." + EXTENSION;

		System.out.println("Interpreting file " + program);

		Simple1Lexer lexer = new Simple1Lexer(new ANTLRFileStream(program));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		Simple1Parser parser = new Simple1Parser(tokens);

		Simple1Parser.ProgramContext tree = parser.program();

		Simple1CustomVisitor visitor = new Simple1CustomVisitor();
		visitor.visit(tree);

		System.out.println("Interpretation finished");

	}

}
