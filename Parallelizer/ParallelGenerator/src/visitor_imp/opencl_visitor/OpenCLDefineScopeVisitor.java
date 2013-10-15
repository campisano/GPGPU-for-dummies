package visitor_imp.opencl_visitor;

import java.util.List;

import model.statement.Statement;
import visitor.DefineScopeVisitor;

public class OpenCLDefineScopeVisitor implements DefineScopeVisitor {
	public void execute(String scopeName, List<Statement> statements) {
		System.out.println("struct " + scopeName);
		System.out.println("{");

		for (Statement s : statements) {
			System.out.print("    ");
			s.execute();
		}

		System.out.println("};");
	}
}
