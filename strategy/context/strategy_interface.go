package context

type Operation interface {
	Execute(a int, b int) int
}
