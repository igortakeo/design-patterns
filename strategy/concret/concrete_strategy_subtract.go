package concret

type ConcreteStrategySubtract struct {
}

func (c *ConcreteStrategySubtract) Execute(a int, b int) int {
	return a - b
}
