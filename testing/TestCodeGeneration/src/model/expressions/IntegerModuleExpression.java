package model.expressions;

import model.common.Scope;

public class IntegerModuleExpression extends
		A_BinaryExpression<Integer, Integer> {

	public IntegerModuleExpression(I_Expression<Integer> _first,
			I_Expression<Integer> _second) {
		super(_first, _second);
	}

	public Integer evaluate(Scope _scope) throws Exception {
		return new Integer(m_first.evaluate(_scope)
				% (m_second.evaluate(_scope)));
	}
}
