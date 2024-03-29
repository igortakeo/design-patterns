package context

type Calculator struct {
	ConcreteOperation Operation
}

func (c *Calculator) SetOperation(concreteOperation Operation) {
	c.ConcreteOperation = concreteOperation
}
