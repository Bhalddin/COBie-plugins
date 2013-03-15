package org.erdc.cobie.shared.targetunits.volume;

import org.bimserver.models.ifc2x3tc1.IfcUnit;
import org.erdc.cobie.shared.targetunits.UnitTextMatcher;

public class CubicMetersTextMatcher extends UnitTextMatcher
{

    public CubicMetersTextMatcher(String searchString)
    {
        super(searchString);

    }

    @Override
    protected String[] getTargetStringArray()
    {
        return VolumeStatics.Metric.CubicMeters.UNIT_STRINGS;
    }

    @Override
    public IfcUnit getTargetUnit()
    {
        return VolumeStatics.Metric.CubicMeters.getUnit();
    }

}
