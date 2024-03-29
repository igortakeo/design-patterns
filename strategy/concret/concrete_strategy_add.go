package concret

type ConcreteStrategyAdd struct {
}

func (c *ConcreteStrategyAdd) Execute(a int, b int) int {
	return a + b
}
