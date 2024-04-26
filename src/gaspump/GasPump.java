package gaspump;

import absfactory.AbstractFactory;
import datastore.DataSource;
import mdaefsm.MDA_EFSM;
import project.OP;
//abstract class for gaspump , created this to manage the refernces and initializations of OP, and datasource.
public abstract class GasPump {
	DataSource data;
	MDA_EFSM model;

	GasPump(AbstractFactory af) {
		this.data = af.getDataObj();
		this.model = new MDA_EFSM();
		this.model.setOP(new OP(af));
	}
}
