package org.erdc.cobie.shared.targetunits.area;

import org.bimserver.models.ifc2x3tc1.IfcUnit;
import org.erdc.cobie.shared.targetunits.UnitTextMatcher;
import org.erdc.cobie.shared.targetunits.area.AreaStatics.Metric.SquareKilometers;

public class SquareKilometersTextMatcher extends UnitTextMatcher
{

    public SquareKilometersTextMatcher(String searchString)
    {
        super(searchString);
    }

    @Override
    protected String[] getTargetStringArray()
    {
        return SquareKilometers.UNIT_STRINGS;
    }

    @Override
    public IfcUnit getTargetUnit()
    {
        return SquareKilometers.getUnit();
    }

}
