<?php

namespace CalculatorBundle\Entity;

class Calculator
{
    /**
     * @var float
     */
    private $leftOperand;

    /**
     * Get left operand
     *
     * @return float
     */
    public function getLeftOperand()
    {
        return $this->leftOperand;
    }

    /**
     * Set left operand
     *
     * @param float $operand
     *
     * @return Calculator
     */
    public function setLeftOperand(float $operand)
    {
        $this->leftOperand = $operand;

        return $this;
    }

    /**
     * @var float
     */
    private $rightOperand;

    /**
     * Get right operand
     *
     * @return float
     */
    public function getRightOperand()
    {
        return $this->rightOperand;
    }

    /**
     * Set right operand
     *
     * @param float $operand
     *
     * @return Calculator
     */
    public function setRightOperand(float $operand)
    {
        $this->rightOperand = $operand;

        return $this;
    }

    /**
     * @var string
     */
    private $operator;

    /**
     * Get operator
     *
     * @return float
     */
    /**
     * @return string
     */
    public function getOperator()
    {
        return $this->operator;
    }

    /**
     * Set operator
     *
     * @param string $operator
     *
     * @return Calculator
     */
    public function setOperator(string $operator)
    {
        $this->operator = $operator;

        return $this;
    }
}