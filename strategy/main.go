package main

import (
	"fmt"
	"strategy/concret"
	"strategy/context"
)

func main() {
	add := &concret.ConcreteStrategyAdd{}
	strategyContext := &context.Calculator{
		ConcreteOperation: add,
	}

	fmt.Println("Add response: ", strategyContext.ConcreteOperation.Execute(5, 6))

	subtract := &concret.ConcreteStrategySubtract{}
	strategyContext.SetOperation(subtract)

	fmt.Println("Subtract response: ", strategyContext.ConcreteOperation.Execute(5, 6))
}
