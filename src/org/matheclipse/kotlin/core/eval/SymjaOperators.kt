package org.matheclipse.kotlin.core.eval

import org.matheclipse.core.interfaces.IExpr
import org.matheclipse.core.expression.F.*

/**
 * Enables the use of the operator [IExpr] `+ IExpr`.
 */
operator fun IExpr.plus(other: Int) : IExpr = this.plus(ZZ(other.toLong()))

/**
 * Enables the use of the operator [IExpr] `+ IExpr`.
 */
operator fun Int.plus(other: IExpr) : IExpr = ZZ(this.toLong()).plus(other)

/**
 * Enables the use of the operator [IExpr] `+ IExpr`.
 */
operator fun IExpr.times(other: Int) : IExpr = this.times(ZZ(other.toLong()))

/**
 * Enables the use of the operator [IExpr] `+ IExpr`.
 */
operator fun Int.times(other: IExpr) : IExpr = ZZ(this.toLong()).times(other)

/**
 * Enables the use of the operator [IExpr] `- IExpr`.
 */
operator fun IExpr.minus(other: IExpr) : IExpr = this.minus(other)

/**
 * Enables the use of the operator [IExpr] `+ IExpr`.
 */
operator fun IExpr.minus(other: Int) : IExpr = this.minus(ZZ(other.toLong()))

/**
 * Enables the use of the operator [IExpr] `+ IExpr`.
 */
operator fun Int.minus(other: IExpr) : IExpr = ZZ(this.toLong()).minus(other)

/**
 * Enables the use of the operator [IExpr] `/ IExpr`.
 */
operator fun IExpr.div(other: IExpr) : IExpr = this.divide(other)

/**
 * Enables the use of the operator [IExpr] `% IExpr`.
 */
operator fun IExpr.rem(other: IExpr) : IExpr = this.mod(other)

/**
 * Enables the use of the operator [IExpr] `% IExpr`.
 */
operator fun IExpr.rem(other: Int) : IExpr = this.mod(ZZ(other.toLong()))

/**
 * Enables the use of the operator [IExpr] `% IExpr`.
 */
operator fun Int.rem(other: IExpr) : IExpr = ZZ(this.toLong()).mod(other)