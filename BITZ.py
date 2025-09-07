def compounding_yield(apr_percent, periods_per_year, interval_days):
    r = apr_percent / 100
    n = periods_per_year
    t = interval_days / 365

    yield_percent = ((1 + r / n) ** (n * t) - 1) * 100
    return yield_percent

# Usage:
apr = 310  # e.g., 12% APR
n = 8640 * 365  # compounding every 10 seconds

daily_yield = compounding_yield(apr, n, 1)
weekly_yield = compounding_yield(apr, n, 7)
monthly_yield = compounding_yield(apr, n, 30.436875)
yearly_yield = compounding_yield(apr, n, 365)

print(f"Daily: {daily_yield:.4f}%")
print(f"Weekly: {weekly_yield:.4f}%")
print(f"Monthly: {monthly_yield:.4f}%")
print(f"Yearly: {yearly_yield:.4f}%")
