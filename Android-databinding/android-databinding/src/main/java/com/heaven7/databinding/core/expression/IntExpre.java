package com.heaven7.databinding.core.expression;


import com.heaven7.databinding.core.DataBindException;
import com.heaven7.databinding.core.IDataResolver;

public class IntExpre implements IExpression{
	
	private Integer value;
	
	public IntExpre(Integer value) {
		super();
		this.value = value;
	}

	@Override
	public void reset() {
	}

	@Override
	public Object evaluate(IDataResolver dataResolver) throws DataBindException {
		return value;
	}

}
