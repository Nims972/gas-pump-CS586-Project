package gaspump;

import absfactory.AbstractFactory;
import datastore.DataSource;
import mdaefsm.MDA_EFSM;
import project.OP;

public abstract class GasPump {
	DataSource data;
	MDA_EFSM model;

	GasPump(AbstractFactory af) {
		this.data = af.getDataObj();
		this.model = new MDA_EFSM();
		this.model.setOP(new OP(af));
	}

	/*
	 * Each GasPump must display a menu of its supported operations
	 */
	public abstract void printOperations();
}
